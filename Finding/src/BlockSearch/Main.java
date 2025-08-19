package BlockSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blockArr = {b1, b2, b3};

        int num = 66;

        int index = getIndex(blockArr, arr, num);

        System.out.println(index);
    }

    private static int getIndex(Block[] blockArr, int[] arr, int num) {
        int block = findIndexBlock(blockArr, num);

        if (block == -1 || block == blockArr.length) {
            return -1;
        }

        for (int i = blockArr[block].getStartIndex(); i <= blockArr[block].getEndIndex(); i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    private static int findIndexBlock(Block[] blockArr, int num) {
        if (blockArr == null || blockArr.length == 0) {
            return -1;
        }
        // take care of the targetIndex which is like a sector
        int targetIndex = blockArr.length;

        int min = 0, max = blockArr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (blockArr[mid].getMax() >= num) {
                targetIndex = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return targetIndex;
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public Block() {
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}