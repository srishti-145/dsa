class Solution {
    int[] parent;
    public int findPar(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = findPar(parent[x]);
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        int n = 10000; 
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        HashMap<String, Integer> emailToId = new HashMap<>();
        HashMap<String, String> emailToName = new HashMap<>();

        int id = 0;

        for (int i = 0; i < accounts.size(); i++) {

            List<String> account = accounts.get(i);
            String name = account.get(0);

            for (int j = 1; j < account.size(); j++) {

                String email = account.get(j);

                if (!emailToId.containsKey(email)) {
                    emailToId.put(email, id++);
                }

                emailToName.put(email, name);

                if (j > 1) {
                    int firstEmailId = emailToId.get(account.get(1));
                    int currentEmailId = emailToId.get(email);

                    int p1 = findPar(firstEmailId);
                    int p2 = findPar(currentEmailId);

                    if (p1 != p2) {
                        parent[p2] = p1;
                    }
                }
            }
        }
        HashMap<Integer, List<String>> parentToEmails = new HashMap<>();

        List<String> emailKeys = new ArrayList<>(emailToId.keySet());

        for (int i = 0; i < emailKeys.size(); i++) {

            String email = emailKeys.get(i);
            int root = findPar(emailToId.get(email));

            if (!parentToEmails.containsKey(root)) {
                parentToEmails.put(root, new ArrayList<>());
            }

            parentToEmails.get(root).add(email);
        }
        List<List<String>> result = new ArrayList<>();
        List<List<String>> groupedEmails = new ArrayList<>(parentToEmails.values());

        for (int i = 0; i < groupedEmails.size(); i++) {

            List<String> emails = groupedEmails.get(i);

            Collections.sort(emails);

            List<String> temp = new ArrayList<>();

            String name = emailToName.get(emails.get(0));
            temp.add(name);

            for (int j = 0; j < emails.size(); j++) {
                temp.add(emails.get(j));
            }

            result.add(temp);
        }

        return result;
        
    }
}