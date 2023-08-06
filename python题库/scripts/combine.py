n=int(input())
# 最多为2个
# i 表示该放第几个位置
# record 表示前面 0 ... i-1 位置放的是什么 0-铀 1-铅?
def F(i,record):
    if( i == n):
        pass
    else:
        if(len(record)>=2 and (record[i-1]==0 and record[i-2]==0)):
            # 只能放铅
            record.append(1)
            F(i+1,record)
            record.pop()
        else:
            # 或者放铀
            record.append(0)
            F(i+1,record)
            record.pop()
            # 能放铅
            record.append(1)
            F(i+1,record)
            record.pop()

record = []
F(0,record)
