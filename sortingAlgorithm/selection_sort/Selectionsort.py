def selectionSort(arr):
    n = len(arr)
    for i in range(0, n):
        min_index = i

        for j in range(i + 1, n):
            if arr[j] < arr[min_index]:
                min_index = j

        arr[min_index], arr[i] = arr[i], arr[min_index]


arr = [69, 99, 23, 55, 11, 45, 66]
selectionSort(arr)
print(arr)
