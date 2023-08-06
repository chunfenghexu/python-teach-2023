count = 0
# 规定 0表示放铀 1表示放铅
def F(n,i,record):
    global count
    if(i==n):
        count += 1 
    else:
        if(len(record)>=2 and (record[i-1]==0 and record[i-2]==0)):
            # 放铅
            record.append(1)
            F(n,i+1,record)
            record.pop()
        else:
            # 放铅
            record.append(1)
            F(n,i+1,record)
            record.pop()
            # 放铀
            record.append(0)
            F(n,i+1,record)
            record.pop()

n = int(input())
record = []
F(n,0,record)
res = 2**n - count
print(res)
