export interface FoodItem {
  id: number;
  name: string;
  price: number;
  calorie: number;
  description: string;
  pictureUrl: string;
}

export interface Category {
  id: number;
  category: string;
  foodItemList: FoodItem[];
}

export interface RestaurantMenu {
  categories: Category[];
}

export interface FoodItemDetailInfo {
  id: number;
  name: string;
  price: number;
  calorie: number;
  description: string;
  pictureUrl: string;
}

export interface CategorySelector {
  categories: Category[];
  selectedCategoryId: number | null;
  onCategoryClick: (categoryId: number) => void;
}

export interface CategorySection {
  category: Category;
  onCardClick: (itemId: number) => void;
}
