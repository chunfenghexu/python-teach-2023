#
Map = [
        [0,0,0],
        [1,1,0],
        [0,1,0]
      ]
# F 表示 下一步 往哪里走
start = (0,0)
end = (2,2)
L = [] # 表示已经走过的路 元素 (i,j)

# L 表示已经走过的位置
# i,j表示下一个步要走的位置
def check1(L,i,j):
    for pos in L:
        if( pos[0] == i and pos[1] == j):
            return False
    return True
def F(i,j):
    if(i==end[0] and j==end[1]):
        print('Yes')
    else:
        # 上
        if(i-1 >= 0 and check1(L,i-1,j) and Map[i-1][j] == 0):
            L.append((i-1,j))
            F(i-1,j)
            L.pop()
        # 下
        if(i+1 <= 2 and check1(L,i+1,j) and Map[i+1][j] == 0):
            L.append((i+1,j))
            F(i+1,j)
            L.pop()
        # 左
        if(j-1 >= 0 and check1(L,i,j-1) and Map[i][j-1] == 0 ):
            L.append((i,j-1))
            F(i,j-1)
            L.pop()
        # 右
        if(j+1 <= 2 and check1(L,i,j+1) and Map[i][j+1] == 0):
            L.append((i,j+1))
            F(i,j+1)
            L.pop()
#F(0,0)
L = [0,0,0]
try:
    # 先看看会不会异常
    L[3]
except:
    # 然后在对异常处理
    print(L[2])

i = 3
# 先验证，后使用
if(i < 3):
    L[i]


    
