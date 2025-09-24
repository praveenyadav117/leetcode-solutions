class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        if (arr.length == 0)
            return result;
        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        while (top <= bottom && left <= right) {
            //left-right
            for (int i = left; i <= right; i++) {
                result.add(arr[top][i]);
            }
            top++;
            //top-bottom
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;
            // right-left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
            }

            bottom--;
            //bottom-top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
            }

            left++;
        }
        return result;
    }
}