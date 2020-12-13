使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方

1、二分选中中间位置

2、如果该位置元素比后面一个元素大则是无序的地方

3、如果该位置元素大于等于起始位置元素，则说明无序的地方在右边

4、如果该位置的元素小于起始元素，则说明无序的地方在左边

    public static int findMid(int[] array){
        int left = 0;
        int right = array.length-1;
        int start = array[0];
        while(left <= right){
            int mid = (left + right)/2;
            if(mid + 1 <= array.length-1 && array[mid] > array[mid+1]){
                return mid;
            }else if(array[mid] >= start){
                left = mid + 1;
            }else if(array[mid] < start){
                right = mid - 1;
            }
        }
        return 0;
    }
