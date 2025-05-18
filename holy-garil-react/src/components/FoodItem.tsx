import { useEffect, useState } from "react";
import "./FoodItem.css";

interface FoodItemDetailInfo {
  id: number;
  name: string;
  price: number;
  calorie: number;
  description: string;
  pictureUrl: string;
}

function FoodItem() {
  const [item, setItem] = useState<FoodItemDetailInfo | null>(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string>();

  useEffect(() => {
    fetch("http://localhost:8080/food/item")
      .then(async (response) => {
        if (!response.ok) throw new Error(`HTTP ${response.status}`);
        const data: FoodItemDetailInfo = await response.json();
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
    <div className="food-item">
      <img src={item.pictureUrl} alt={item.name} />
      <section>
        <FoodItemDetail
          name={item.name}
          price={item.price}
          calorie={item.calorie}
          description={item.description}
        />
      </section>
    </div>
  );
}

/**
 * Render food item detail
 * @param name The name of the food
 * @param price Price
 * @param calorie Calorie
 * @param description Food description
 */
function FoodItemDetail({
  name,
  price,
  calorie,
  description,
}: {
  name: string;
  price: number;
  calorie: number;
  description: string;
}) {
  return (
    <>
      <h2>{name}</h2>
      <p>
        <strong>Price:</strong> £{price.toFixed(2)}
      </p>
      <p>
        <strong>Calories:</strong> {calorie}
      </p>
      <p>{description}</p>
    </>
  );
}

export default FoodItem;
