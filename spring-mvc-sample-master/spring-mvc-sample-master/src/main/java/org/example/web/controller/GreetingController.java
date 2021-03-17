@RequestMapping("/bye")
public String bye(@RequestParam(value="Renato", required=false,
defaultValue="Universe") String name, Model model) {
model.addAttribute("Renato", name);
return "bye";
}