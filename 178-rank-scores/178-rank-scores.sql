/* Write your T-SQL query statement below */
Select score, dense_rank() over(order by score desc) rank from Scores