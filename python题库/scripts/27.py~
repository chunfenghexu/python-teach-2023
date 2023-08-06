# 确定数据结构
matrix = [ [ '.' for i in range(8)] for j in range(8)]
print(matrix)

# 列表 列表里面的元素是坐标 (x,y)
record = []


def printQueen():
    # for 遍历

def check(record,i,j):
    for row,col in record:
        # 判断(i,j) 是否和之前放的皇后冲突
# F(i) 表示该放第几行的皇后了
def F(i):
    if i == 8:
        # 输出结果
        printQueen()
    else:
        # 一行可以放八个位置
        for j in range(8):
            if check(record,i,j) :
                # 放皇后
                matrix[i][j] = 'A'
                # 记录
                record.append((i,j))
                F(i+1)
                # 恢复现场
                matrix[i][j] = '.'
                record.pop()



F(0)
