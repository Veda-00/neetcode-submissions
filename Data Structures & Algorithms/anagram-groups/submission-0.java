class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ls=new ArrayList<>();
        for(String s:strs){
            char[] ca=s.toCharArray();
            Arrays.sort(ca);
            String key=new String(ca);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }

        for(Map.Entry<String,List<String>> e:map.entrySet()){
            ls.add(e.getValue());
        }
        return ls;
    }
}
