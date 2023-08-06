matrix = [ [ 0 for i in range(3)] for j in range(3)]
nums = [ x for x in range(1,10)]
visited = [ 0 for x in range(9)] # 0表示未访问 ， 1表示访问了

# i 表示是矩阵的坐标
# row = i // 3
# col = i % 3
# F函数表示的是放第i个格子
def check1(matrix):
    # check 行
    # check 列
    res = True
    for i in range(3):
        sumRow = 0
        sumCol = 0
        for j in range(3):
            sumRow += matrix[i][j]
            sumCol += matrix[j][i]
        if sumRow != 15 or sumCol != 15 :
            res = False
            break
    # check 对角线
    suma = matrix[0][0] + matrix[1][1] + matrix[2][2]
    sumb = matrix[0][2] + matrix[1][1] + matrix[2][0]
    return res and (suma == sumb and suma == 15)


def check2(matrix):
    res = True
    for i in range(3):
        for j in range(3):
            res = res and (matrix[i] != matrix[j] )
            if not res:
                break
    return res

def F(i):
    global nums
    global matrix
    global visited
    if i == 9:
        #print("一个解构建完成")
        # 所有格子已经放完
        if check1(matrix): 
            print(matrix)
    else:
        # 放第i个格子，选择放那个数
        for index in range(len(nums)):
            if visited[index] == 0:
                row = i // 3
                col = i % 3
                matrix[row][col] = nums[index]
                visited[index] = 1 # row行、col列已经放了 nums[index]
                F(i+1)
                # 恢复现场
                visited[index] = 0 # 回溯算法的精髓的体现

# 从第 0 个格子开始
F(0)
