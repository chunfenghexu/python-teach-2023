n = int(input())
k = int(input())
# 加入缓存的版本
cache = [-1 for i in range(n)]
def F(n,k):
    if(n < k):
        return 0
    elif(n == k):
        return 1
    else:
        sum = 0
        for i in range(k):
            if cache[n-i-1] != -1:
                sum += cache[n-i-1]
            else:
                sum += F(n-i-1,k)
        cache[n] = sum
        return sum

print(F(n,k))
