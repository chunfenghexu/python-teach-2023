# 0 表示 淘汰 ， 1 表示 未淘汰
m = 3
n = 2
L = [ 1 for i in range(2*m)]
length = len(L)
t_num = 0 # 淘汰的人数
count = 0 # 数数
# 1. 顺时针转
i = 0
while(t_num < m):
    if(L[i] == 0):
        i = (i + 1 + length)%length
        continue
    count += 1    # bug1 : 应该放在上面，之前放在20行上面
    if(count==n):
        t_num += 1
        print(i)
        L[i] = 0
        count = 0
    i = (i + 1 + length)%length
# 2. 逆时针转
i = (i-1 +length)%length  # bug2 : 这里转向数之前要逆时针倒退一步
count = 0
while(t_num < 2*m-1):    # bug3 : 这个地方应该控制删到第2*m-1个，这样能保证最后留一个太子，之前写的是2*m，删完了
    if(L[i] == 0):
        i = (i-1 +length)%length
        continue
    count += 1    # bug4 : 和bug1是同样的问题
    if(count == n):
        t_num += 1
        print(i)
        L[i] = 0
        count = 0
    i = (i-1 +length)%length
print(L)
    
