import { Project } from "../models/project.js";
import { ProjectStatus } from "../models/project.js";

// Project State Management
type Listeners<T> = (items: T[]) => void;

class State<T>{
    protected listeners: Listeners<T>[] = [];

    addListener(fn: Listeners<T>){
        this.listeners.push(fn);
    }
}

class ProjectState extends State<Project>{
    private projects: Array<Project> = [];
    private static instance: ProjectState;

    static getInstance(){
        if(!this.instance) this.instance = new ProjectState();
        return this.instance;
    }

    addProject(title: string, description: string, people: number){
        this.projects.push(new Project(
            `project-${this.projects.length}`,
            title,
            description,
            people,
            ProjectStatus.active));

        this.updateListeners();
    }

    moveProject(projectId: string, newStatus: ProjectStatus){
        const project = this.projects.find(project => project.id === projectId);
        if(project && project.status !== newStatus){
            project.status = newStatus;
            this.updateListeners();
        }
    }

    updateListeners(){
        for(const fn of this.listeners){
            fn(this.projects.slice());
        }
    }
}

export const projectState = ProjectState.getInstance();