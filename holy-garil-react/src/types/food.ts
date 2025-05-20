export interface FoodItem {
  id: number;
  name: string;
  price: number;
  calorie: number;
  description: string;
  pictureUrl: string;
}

export interface FoodItemMenu {
  title: string;
  foodItems: FoodItem[];
}

export interface FoodItemDetailInfo {
  id: number;
  name: string;
  price: number;
  calorie: number;
  description: string;
  pictureUrl: string;
}
