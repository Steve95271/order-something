USE holy_grail;


INSERT INTO food (name, price, calorie, description, pictureUrl)
VALUES ('McSpicy® x Frank\'s RedHot®',
        '6.59',
        507,
        'Hot and spicy 100% chicken breast in a crispy coating, served with lettuce, cheese made with Emmental, jalapenos, onions and a Frank’s RedHot® Mayo in a sesame seed bun. Allergen information available at www.mcdonalds.co.uk/nutrition',
        'https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif'
       ),
       ('Steakhouse Stack',
        '6.49',
        667,
        'Two 100% British and Irish beef patties, a slice of cheddar cheese, crispy onions, red onions and lettuce served with a black peppercorn sauce, all in a freshly toasted glazed sesame topped bun. Allergen info: www.mcdonalds.co.uk/nutrition',
        'https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif'
       ),
       ('Cheesy Garlic Bread Dippers Sharebox®',
        '6.99',
        641,
        'A portion of twelve dippers of mozzarella cheese flavoured with garlic and chives, in a ciabatta-style breadcrumb coating, served with rich tomato dip. Serves 3. Allergen information available at www.mcdonalds.co.uk/nutrition',
        'https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif'
       ),
       ('The Deluxe Duo Deal (for Two)',
        '11.99',
        2160,
        'Choose two burgers with two medium fries. Product customisation may not be possible on this deal. Allergen information available at mcdonalds.co.uk/nutrition',
        'https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif'
       ),
       ('Feed the Family Deal (for Four)',
        '14.99',
        3008,
        'Choose two core burgers & two small burgers with two medium fries & two small fries. Product customisation may not be possible on this deal. Allergen information available at mcdonalds.co.uk/nutrition',
        'https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif'
       ),
       ('The McDonald\'s Chicken Sharebox®',
        '10.99',
        1240,
        '6x Chicken Selects® with 12x Chicken McNuggets®, 2x McNuggets® Dips and 2x Selects Dips. Serves 4 people (per serving 1297KJ/310kcal). Allergen info: www.mcdonalds.co.uk/nutrition',
        'https://stevefengsbucket.s3.eu-west-2.amazonaws.com/Holy_Grail/mc_burger.avif'
       );

INSERT INTO category (category)
VALUES ('Featured'),
       ('What\'s New?'),
       ('Sharers & Bundles');

INSERT INTO food_category (food_id, category_id)
VALUES (1, 1),
       (2, 1),
       (3, 1),
       (4, 1),
       (5, 1),
       (6, 1),
       (1, 2),
       (2, 2),
       (3, 3),
       (4, 3),
       (5, 3),
       (6, 3);



