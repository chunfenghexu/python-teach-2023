coins = [2,10]
amount=19
cache = [-float('INF') for i in range(amount+1)]
cache[0] = 0
for a in range(1,amount+1):
    m = float('INF')
    for coin in coins:
        if a - coin >= 0: # 小于 0 
            m = min(m,cache[a-coin]+1)
    cache[a] = m 

print(-1 if cache[amount] == float('INF') else cache[amount] )
print(cache)

