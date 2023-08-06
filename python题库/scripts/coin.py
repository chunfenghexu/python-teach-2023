coins = [1,2,5,10]
amount=100
cache = [-float('INF') for i in range(amount+1)]
def dp(amount):
    # base case
    if amount == 0 :
        return 0
    elif amount < 0:
        return -1
    else:
        m = float('INF')
        for coin in coins:
            nm = 0
            if cache[amount-coin] != -float('INF'):
                nm = cache[amount-coin]
            else:
                nm = dp(amount-coin)
                cache[amount-coin]=nm
            if nm != -1:
                m = min(m,nm+1)
        if m == float('INF'):
            return -1
        return m
print(dp(amount))
