MATRIX_LENGTH = 31
matrix = [ [0 for i in range(MATRIX_LENGTH)] for j in range(MATRIX_LENGTH)]

def check(matrposx,row,col):
    # 行检查
    sum_row_1 = 0
    sum_row_01 = 0
    for i in range(col+1):
        if matrix[row][i] == 1:
            sum_row_1 += 1
        if matrix[row][i] == -1:
            sum_row_01 += 1
    # 列检查
    sum_col_1 =0
    sum_col_01 =0
    for j in range(row+1):
        if matrix[j][col] == 1:
            sum_col_1 += 1
        if matrix[j][col] == -1:
            sum_col_01 += 1
    return sum_row_1 <=16 and sum_col_1 <=16 and sum_row_01 <= 15 and sum_col_01 <=15 
    
           
# 可以想 8皇后问题一样 按行放
total = 1
count = 0 
def F(i):
    global count
    global total
    row = i // MATRIX_LENGTH
    col = i % MATRIX_LENGTH
    print(row,col)
    if row==MATRIX_LENGTH and col==0:
        count += 1
        for i in range(MATRIX_LENGTH):
            print(matrix[i])
    else:
        if count < total:
            # 放 1
            matrix[row][col] = 1
            if check(matrix,row,col):
                F(i+1) # 放下一个
            # 放 -1 , 若已经找到一个解就停止递归
            matrix[row][col] = -1
            if check(matrix,row,col):
                F(i+1) # 放下一个
F(0)
