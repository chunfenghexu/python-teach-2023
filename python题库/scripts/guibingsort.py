L = [2,5,2,90,23,235,84,92,10,342]

def merge(left_l,right_l):
    print(left_l,right_l)
    i,j,k=0,0,0
    ll,rl = len(left_l),len(right_l)
    new_l = [0 for i in range(ll+rl)]
    while i < ll and j < rl:
        while(i < ll and j < rl and left_l[i] <= right_l[j]):
            new_l[k] = left_l[i] 
            k += 1
            i += 1
        while(i < ll and j < rl and left_l[i] > right_l[j]):
            new_l[k] = right_l[j]
            k += 1
            j += 1
    if i == ll : 
        while j < rl:
            new_l[k] = right_l[j]
            k += 1
            j += 1
    elif j == rl:
        while i < ll:
            new_l[k] =left_l[i]
            k += 1
            i += 1
    return new_l


# 分治 - 归并排序
def F(left,right):
    if left >= right:
        return list([L[left]])
    else:
        middle = (left + right) // 2
        # 处理左边
        left_l = F(left,middle)
        # 处理右边
        right_l = F(middle+1,right)
        # 合并
        return merge(left_l,right_l)

testLL = [1]
testRL = [2]
print(merge(testLL,testRL))
print(F(0,len(L)-1))
