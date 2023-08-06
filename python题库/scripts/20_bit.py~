def F(n):
    count = 0
    for num in range(0,2**n):
        while(num>=7):
            if(num & 7 == 7):
                count += 1
                break
            num = num >> 1
    return count

n = int(input())
print(F(n))
