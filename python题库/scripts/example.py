def Fsum(i,j,L):
    sum  = 0
    for x in range(i,j+1):
        sum += L[x]
    return sum
res = 0
k=int(input())
m=int(input())
list = [ 0 for i in range(k-1)]
list.append(1)
if m == k-1:
    res = 1
elif m > k-1:
    j = 0
    for i in range(k,m):
        sum = 0
        for x in range(j,i):
            sum += list[x]
        list.append(sum)
        j += 1
        
print(list[m-1])


