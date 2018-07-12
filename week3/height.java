l=[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
m=[]
r=[]
while len(l)is not 0:
    mini = [100000,10000]
    for i in l:
        print(i)
        if i[1]<=mini[1]:
            mini=i
    c=0
    if len(r) is not 0:
        l.extend(r)
    for j in m:
        print("mmmmmmmmmmmmmmmmmmmmmm",m)
        print("jjjjjjjjjjjjjjjjjjj",j)
        
        
        if j[0]>=mini[0]:
            c=c+1
    
    if c==mini[1]:
        m.append(mini)
        
        print("           ",m)
        
        l.remove(mini)
    else:
        r.extend(mini)
        l.remove(mini)
        
                
            
        
