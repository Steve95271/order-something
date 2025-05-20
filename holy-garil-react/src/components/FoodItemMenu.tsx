import type { FoodItemMenu as Menu } from "../types/food.ts"
import { useEffect, useState } from "react";
import FoodItemCard from "./FoodItemCard";
import classes from "../assets/styles/foodItemMenu.module.css";

function FoodItemMenu(){
  const [menu, setMenu] = useState<Menu | null>(null);
  const [loading, setLoading] = useState<boolean>(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    fetch(`http://localhost:8080/food/menu`)
      .then(async (response) => {
        if (!response.ok) throw new Error(`HTTP ${response.status}`);
        const data: Menu = await response.json();
        console.log(data);
        setMenu(data);
      })
      .catch((err) => {
        console.error("Failed to fetch the menu", err);
        setError(err.message);
      })
      .finally(() => setLoading(false));
  }, []);

    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error: {error}</p>;
    if (!menu) return <p>No data.</p>;

    return (
      <div className={classes.foodItemMenu}>
        <h2>{menu?.title}</h2>
        {menu?.foodItems.map((item) => (
          <FoodItemCard key={item.id} {...item}/>
        ))}
      </div>
    );
}

export default FoodItemMenu