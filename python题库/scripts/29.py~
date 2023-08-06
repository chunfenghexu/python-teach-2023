n = int(input())
N = 2 ** n
matrix = [[0 for i in range(N)] for i in range(N)]
def F(n):
    if n == 0 : 
        matrix[0][0] = 1
    else:
        p = 2 ** (n-1)
        # 处理下一层
        F(n-1)
        # 处理完,进行当前层的拼接
        # 把左上角矩阵 + 2**(n-1) ，向右边平移 2**n
        # 把左上角矩阵 + 2**(n-1) ，向下边平移 2**n
        # 复制到对角线
        for i in range(0,p):
            for j in range(0,p):
                matrix[i][j+p] = matrix[i][j] + 2**(n-1)
                matrix[i+p][j] = matrix[i][j] + 2**(n-1)
                matrix[i+p][j+p] = matrix[i][j] 

F(n)
for i in range(0,N):
    print(matrix[i])
