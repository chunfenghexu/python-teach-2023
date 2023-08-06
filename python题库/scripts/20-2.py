n=int(input())
boxs=[0,1]
nums=[0 for i in range(n)]
count=0

def check(nums):
    for i in range(n-2):
        if(nums[i]==1 and nums[i]==nums[i+1] and nums[i]==nums[i+2]):
            return True
    return False

def F(i):
    global count
    global nums
    if(i==n):
        #if check(nums):
        count=count+1
    else:
        if i >=2 and nums[i-1] == 1 and nums[i-2] == 1:
            # 放 0 
            nums[i] = 0
            F(i+1)
        else:
            # 并列的放 0 或 1
            nums[i]= 0
            F(i+1)
            # 恢复现场
            # 
            nums[i] = 1
            F(i+1)

F(0)
print(2**n - count)
