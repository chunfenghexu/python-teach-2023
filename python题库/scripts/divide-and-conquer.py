left=[2,4,5]
right=[3,6,9]
def merge(left,right):
    print(1)
    i=0
    j=0
    k=0
    l1=len(left)
    l2=len(right)
    newList = [0 for i in range(l1+l2)]
    while i<l1 and j<l2:
        if left[i]<=right[j]:
            newList[k]=left[i]
            i = i+1
            k = k+1
        else:
            newList[k]=right[j]
            k = k+1
            j = j+1
    if i == l1:
        while j < l2:
            newList[k]=right[j]
            k = k+1
            j = j+1
    else:
        while i < l1:
            newList[k]=right[i]
            k = k+1
            i = i+1
    print(newList)
    return newList
merge(left,right)







def F(left,right):
    if left>=right:
        return list([L[left]])
    else:
        middle=(left+right)//2
        left_l = F(left,middle)
        right_l = F(middle+1,right)
        return merge(left_l,right_l)
