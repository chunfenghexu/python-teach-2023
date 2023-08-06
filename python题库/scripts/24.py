def isEqual(pkg1,pkg2):
    for i in range(len(pkg1)):
        if pkg1[i] != pkg2[i]:
            return False
    return True
def judge(pkg_s):
    pkg = pkg_s[:]
    if(pkg[0]):
        pkg[1]=False
    else:
        pkg[1] = True
    if(pkg[1]):
        pkg[2]=False
    else:
        pkg[2]=True
    if(pkg[2]):
        pkg[0]=False
        pkg[1]=False
        return isEqual(pkg,pkg_s)
    else:
        # case 1 甲说慌 乙没有说慌
        pkg[0]=False
        pkg[1]=True
        r1 = isEqual(pkg,pkg_s)
        # case 2 甲没有说慌 乙说慌
        pkg[0]=True
        pkg[1]=False
        r2 = isEqual(pkg,pkg_s)
        # case 1 甲没有说慌 乙没有说慌
        pkg[0]=True
        pkg[1]=True
        r3 = isEqual(pkg,pkg_s)
        return (r1 or r2 or r3)

print(judge([True,False,False]))
print(judge([False,True,False]))
print(judge([False,False,True]))


