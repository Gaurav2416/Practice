def removeDuplicates(array):
    arrayOut=[]
    for value in array:
        if value not in arrayOut:
            arrayOut.append(value);
        else:
            arrayOut.append(0)
    print(arrayOut)

array=[1,2,1,1,1,1,1]
removeDuplicates(array)        