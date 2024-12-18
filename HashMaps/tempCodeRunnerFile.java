Set<Integer> keyset = hm.keySet();
        for(Integer key : keyset){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }