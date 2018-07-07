l= [[1], [1,3], [2], [2,4,6], [], [1,2,3], [1]]
x=len(l)


d={0:"true"}
for i in range(1,x):
    d[i]="False"

for i in range (len(l)):
    for j in l[i]:
        if d.get(i)=="true":
            d[j]="true"
c=0
for i in range(x):
    if d.get(i)=="False":
        c=c+1
if c>0:
    print("False")
else:
    print("True")
  

    
            
            
          
