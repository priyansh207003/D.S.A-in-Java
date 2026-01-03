public class peak_element {
  // step1) Initialize start and end pointers
  // step2) While start is less than end
  //     step2.1) Calculate mid index
  //     step2.2) If element at mid is greater than element at mid+1
  //         step2.2.1) Move end to mid
  //     step2.3) Else
  //         step2.3.1) Move start to mid+1
  // step3) Return start (or end) as the index of a peak element

  public static int peakelement(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] > arr[mid + 1]) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    return start;
  }

  public static void main(String argc[]) {
    int arr[] = { 0, 1, 2, 5, 6, 2, 3, 4 };
    int result = peakelement(arr);
    System.out.println("Peak value at index at " + arr[result]);
  }
}
