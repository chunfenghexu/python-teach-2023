list = ['a','b','c']
# 是否已经找过了
# 0 表示的是还没找
# 1 表示的是找过了
visited=[0,0,0] 
res=[]
# i表示的是第几次选择
def F(i):
    if(i==3):
        print("".join(res))
    else:
        # 做第i次的选择
        for j in range(0,len(list)):
            if(visited[j] == 0):
                res.append(list[j])
                visited[j] = 1
                F(i+1)
                visited[j] = 0 # 回溯思想
                res.pop()

F(
