class LongestName {
  public String longestName(String[] names) {
    String longest = "";
    for (String name : names) {
      if (longest.length() < name) {
        longest = name;
      }
    }
    return longest;
  }
}