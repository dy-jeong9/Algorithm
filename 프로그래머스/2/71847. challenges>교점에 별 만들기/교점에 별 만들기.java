import java.util.*;

class Solution {
    //모든 직선 쌍의
        //교점 좌표 구하기
        //정수 좌표만 저장
    //저장한 좌표 중 최댓값, 최솟값 구하기
    //최댓값, 최솟값으로 2차원 배열 크기 정하기
    //2차원 배열에 별 표시
    //문자열 배열로 변환하여 출력
    
    //좌표를 나타내는 클래스
    private static class Point{
        public final long x, y;
        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }    
    }

    // 교점 구해서 반환하기 위한 메서드
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2){
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if(x % 1 != 0 || y % 1 != 0) return null; // 정수가 아니면 null

        return new Point((long) x, (long) y);
    }
    
    //가장 작은 좌표 찾는 메서드
    private Point getMinPoint(List<Point> points){
        long x = Long.MAX_VALUE; //초기값을 max로 설정해서 비교할 모든 수가 초기값보다 작다는 것을 보장
        long y = Long.MAX_VALUE;
        
        for (Point p : points){
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        
        return new Point(x, y);
    }
    
    //가장 큰 좌표 찾는 메서드
    private Point getMaxPoint(List<Point> points){
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for (Point p : points){
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        
        return new Point(x, y);
    }
    
    //별찍기
    public String[] solution(int[][] line) {        
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < line.length; i++){
            for(int j = i + 1; j < line.length; j++){
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                                                  line[j][0], line[j][1], line[j][2]);
                
                if(intersection != null){
                    points.add(intersection);
                }
            }
        }
        
        //배열의 크기 구하기
        Point minimum = getMinPoint(points);
        Point maximum = getMaxPoint(points);
        
        int width = (int)(maximum.x - minimum.x + 1);//가로
        int height = (int)(maximum.y - minimum.y + 1);//세로
        
        //2차원 배열 선언
        char[][] arr = new char[height][width];
        for (char[] row : arr){
            Arrays.fill(row, '.');
        }
        
        //2차원 배열에 별찍기
        for (Point p : points){
            int x = (int) (p.x - minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }
        
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++){
            result[i] = new String(arr[i]);
        }
        return result;
    }
}
