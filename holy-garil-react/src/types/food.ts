export interface FoodItem {
  id: number;
  name: string;
  price: number;
  calorie: number;
  description: string;
  pictureUrl: string;
}

export interface FoodItemMenu {
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
