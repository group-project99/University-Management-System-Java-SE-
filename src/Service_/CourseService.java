/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service_;

import Repository_.CourseRepository;

/**
 *
 * @author MSI
 */
public class CourseService {
    
    private CourseRepository cr = new CourseRepository();
    
    
    /**
     * generate course details report
     */
    public void report(){
    
        cr.report();
    }
}
