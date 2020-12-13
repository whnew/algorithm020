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
