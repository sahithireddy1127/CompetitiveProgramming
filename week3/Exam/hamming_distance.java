
def convertToBinary2(n):
    s=[]
    
    while n>=1:
        
        x=n%2
        s.insert(0,x)
        n=n//2
   
    return s
def comp(m,n):
    c=0
    while len(m)<10:
        m.insert(0,0)
    while len(n)<10:
        n.insert(0,0)
    for i in range (len(m)):
        if m[i] != n[i] :
            c = c+1
    return c
        
    
        


dec1 = 1
dec2 = 4
m=convertToBinary2(dec1)
n=convertToBinary2(dec2)
print(comp(m,n))

dec1 = 100
dec2 = 250
m=convertToBinary2(dec1)
n=convertToBinary2(dec2)
print(comp(m,n))

dec1 = 25
dec2 = 30
m=convertToBinary2(dec1)
n=convertToBinary2(dec2)
print(comp(m,n))

dec1 = 1
dec2 = 30
m=convertToBinary2(dec1)
n=convertToBinary2(dec2)
print(comp(m,n))

dec1 = 0
dec2 = 255
m=convertToBinary2(dec1)
n=convertToBinary2(dec2)
print(comp(m,n))


