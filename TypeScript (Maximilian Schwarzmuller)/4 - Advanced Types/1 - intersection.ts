type FileData = {
    path: string,
    content: string
}

type Status = {
    isOpen: boolean,
    errorMessage?: string
}

type Database = {
    connectionUrl: string,
    credentials: string
}

type AcessFile = FileData & Status;
type AcessDB = Database & Status;