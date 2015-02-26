@Grab("thymeleaf-spring4")

@Controller
class MyBootApp {

    @RequestMapping("/")
    @ResponseBody
    def top(ModelAndView mv) {
        mv.setViewName("index")
        mv.addObject("title", "Hello!")
        mv.addObject("msg", "welcome to Thymeleaf!")
    }

}
