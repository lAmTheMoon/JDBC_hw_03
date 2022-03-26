select product_name
from orders
         join customers c on c.id = orders.customer_id
where (name = :name)
group by o.product_name;