-- SELECT * FROM users;
-- SELECT * FROM users WHERE name = 'admin' AND password = '1111';
-- SELECT count(*) FROM users;
-- SELECT count(*) as 'count' FROM users WHERE name = 'admin' AND password = '1111';
-- SELECT id, name, password, ts FROM users;
-- SELECT * FROM users WHERE id = 1;
-- SELECT * FROM users WHERE name = 'admin';

-- SELECT * FROM products;
-- SELECT id, name, price, qty, ts FROM products WHERE price >= 20 AND qty >= 20;
-- SELECT id, name, price, qty, ts FROM products WHERE (price * qty) >= 1000;
-- SELECT id, name, price, qty, (price * qty) as 'subtotal', ts FROM products;
-- SELECT id, name, price, qty, (price * qty) as 'subtotal', ts FROM products ORDER BY price ASC, qty DESC;
-- SELECT (price * qty) as subtotal FROM products;
-- SELECT SUM(price * qty) as total FROM products;
-- SELECT id, name, price, qty, ts FROM products;
SELECT price,(price * qty) as 'subtotal' FROM product; 