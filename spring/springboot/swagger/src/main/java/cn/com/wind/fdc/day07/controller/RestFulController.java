package cn.com.wind.fdc.day07.controller;

import cn.com.wind.fdc.day07.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author xlx
 * @Date: 2021/7/26
 * @Description:wind.fdc.springboot_01.controller
 * @version:1.0
 */
@RestController
@RequestMapping("/restful")
@Api("restFul风格调用接口")
public class RestFulController {
    @GetMapping("/findUser")
    public void findUser(@RequestParam(required = true) String name,Integer id){
        System.out.println("findUser name:"+name+"id:"+id);
    }
    @GetMapping
    @ApiOperation("查询所有用户")
    public void findAll(){
        System.out.println("findAll");
    }

    @PostMapping
    public void create(){
        System.out.println("create");
    }

    @PutMapping
    public void update(){
        System.out.println("update");
    }

    @DeleteMapping
    public void delete(){
        System.out.println("delete");
    }

    @GetMapping("/{id}")
    @ApiOperation("通过id查询用户")
    @ApiImplicitParam(name = "id",value = "用户id")
    public void findById(@PathVariable Integer id){
        System.out.println(id);
    }

    @PostMapping("/{id}")
    public void createById(@PathVariable Integer id){
        System.out.println("post id:"+id);
    }

    @PutMapping("/{id}")
    public void putById(@PathVariable Integer id){
        System.out.println("put id"+id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        System.out.println("deleteById id:"+id);
    }
    @GetMapping("/user")
    public void findByName(@RequestBody User user){
        System.out.println("get user:"+user);
    }

    @PostMapping("/user")
    public void createByName(@RequestParam(required = true) String id){
        System.out.println("post user:"+id);
    }

    @PutMapping("/user")
    public void putByName(@RequestParam User user){
        System.out.println("put user"+user);
    }

    @DeleteMapping("/user")
    public void deleteByName(@RequestBody User user){
        System.out.println("deleteById user:"+user);
    }
}
