//119. Pascal's Triangle II


//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.


  
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int r = 1;r <= rowIndex;r++) {
            row.add(0);
            for(int j = r-1;j >=1; j--) {
                row.set(j,row.get(j)+row.get(j-1));
            }
            row.set(r,1);
        }
        return row;
    }
}
