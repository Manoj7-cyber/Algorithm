def bubbleSort(arr):
    n = len(arr)
    for i in range(0, n-1):
        for j in range(0, n-i-1):
            if arr[j]>arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]


arr = [69, 99, 23, 55, -11, 45, 66]
bubbleSort(arr)
print(arr)
