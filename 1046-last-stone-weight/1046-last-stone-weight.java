class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p= new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            p.add(i);
        }
        while(p.size()>1){
            int x=p.poll();
            int y=p.poll();
            if(x!=y){
                p.add(x-y);
            }
        }
    return p.isEmpty()?0:p.peek();
    }
}