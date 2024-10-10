def Subset(a1, a2, n, m):
    if(m>n):
        return "No"
    
    map = {}
    
    for i in a1:
        map[i] = map.get(i, 0) + 1
        
    for i in a2:
        if i not in map or map[i] == 0:
            return "No"
        map[i] -= 1
    return "Yes"


if __name__ == "__main__":
    a1 = [11, 1, 13, 21, 3, 7]
    a2 = [11, 3, 7, 1]
    n = len(a1)
    m = len(a2)
    
    print(Subset(a1, a2, n, m))