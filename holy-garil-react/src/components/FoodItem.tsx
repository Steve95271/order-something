import { useEffect, useState } from "react";

interface Item {
  id: number;
  name: string;
  price: number;
  calorie: number;
  description: string;
  pictureUrl: string;
}

function FoodItem() {
  const [item, setItem] = useState<Item | null>();
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string>();

  useEffect(() => {
    fetch("http://localhost:8080/food/item")
      .then(async (response) => {
        if (!response.ok) throw new Error(`HTTP ${response.status}`);
        const data: Item = await response.json();
        console.log(data);
        setItem(data);
      })
      .catch((err) => {
        console.error("Failed to fetch food item", err);
        setError(err.message);
      })
      .finally(() => setLoading(false));
  }, []);

  if (loading) return <p>Loading...</p>;
  if (error) return <p>Error: {error}</p>;
  if (!item) return <p>No data.</p>;

  return (
    <div>
      <img src={item.pictureUrl} alt={item.name} style={{ width: "300px" }} />
      <h2>{item.name}</h2>
      <p>
        <strong>Price:</strong> £{item.price.toFixed(2)}
      </p>
      <p>
        <strong>Calories:</strong> {item.calorie}
      </p>
      <p>{item.description}</p>
    </div>
  );
}

export default FoodItem;
