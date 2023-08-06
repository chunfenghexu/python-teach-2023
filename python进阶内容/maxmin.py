def minmax(iterable,m = 'min',key = lambda x: x):
    #def createCompare(flag):
    #    return (lambda x,y:x>y) if flag == 'min' else (lambda x,y:y>x)
    comp = (lambda flag: (lambda x,y:x>y) if flag == 'min' else (lambda x,y:y>x))(m)
    mx = iterable[0]
    for i in range(len(iterable)-1):
            if comp(iterable[i],iterable[i+1]): 
                mx = iterable[i+1]
    return mx
        
   # if m =='min' :
   #     min = iterable[0]
   #     for i in range(len(iterable)-1):
   #          if iterable[i]>iterable[i+1]:
   #              min = iterable[i+1]
   #     return min
   # else:
   #     max = iterable[0]
   #     for i in range(len(iterable)-1):
   #          if iterable[i]<iterable[i+1]:
   #              max = iterable[i+1]
   #     return max

list = [2,6,3,9,5,1]
print(minmax(list,m = 'min',key = lambda x: x))
print(minmax(list,m = 'max',key = lambda x: x))

f = lambda x : x*2+x+1
g = lambda x : x*2+x+1

print(f(g(1)))