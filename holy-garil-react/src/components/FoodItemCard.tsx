import type {FoodItem} from "../types/food.ts"


function FoodItemCard({
  pictureUrl,
  name,
  price,
  calorie,
  description,
}: FoodItem) {
  return (
    <div
      style={{
        display: "flex",
        alignItems: "center",
        background: "#fff",
        border: "1px solid rgba(0,0,0,0.2)",
        borderRadius: "12px",
        width: "100%",
        height: "100%",
        maxWidth: "600px",
        boxShadow: "2px 2px 4px rgba(0,0,0,0.05)",
      }}
    >
      <div style={{ flex: 1, minWidth: "300px", padding: "15px" }}>
        <h4 style={{ margin: "0 0 2px" }}>{name}</h4>
        <p style={{ margin: "0 0 12px", color: "rgba(58, 58, 58)", fontSize: "0.8em" }}>
          <span style={{color: "black"}}>£{price}</span>
          <span style={{color: "#444"}}> • {calorie} kcal</span>
        </p>
        <p
          style={{
            margin: 0,
            display: "-webkit-box",
            WebkitBoxOrient: "vertical",
            WebkitLineClamp: 2,
            overflow: "hidden",
            color: "rgb(58, 58, 58)",
            lineHeight: 1.4,
            fontSize: "0.8em",
          }}
        >
          {description}
        </p>
      </div>
      <div style={{ isolation: "isolate", backgroundColor: "#f5f5f5", overflow: "hidden", borderRadius: "0 12px 12px 0" }}>
        <img
          src={pictureUrl}
          alt={`A picture of a ${name}`}
          style={{
            width: "auto",
            height: "150px",
            marginLeft: "15px",
            objectFit: "cover",
            mixBlendMode: "multiply",
          }}
        />
      </div>
    </div>
  );
}

export default FoodItemCard;
